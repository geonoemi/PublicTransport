
    let pizzaCreator=function(){

        //webstorage
        let pizzaArray = getPizzaKeys(); 
        let pizza = $(window).load(function () {
    
            pizza = $("addPizza");
            let pizzaElements = [pizza.name, pizza.description, pizza.price, pizza.quantity, pizza.prodid];
            for (let i = 0; i < pizzaElements.length; i++) {
                pizzaElements[i].addEventListener('blur', (event) => {
                    isValid(event.target);
                });
            }
    
            $(pizza).submit(pizzaValidate);
            $(pizza).submit(function(event) {
                event.preventDefault()
            });
        });

         // ellenőrzi, hogy a megadott input megfelelő-e
        function isValid(input) {
            let x = input.parent();
            let condition;

            let errormessage;

        // ha a vizsgált elem az ár, vagy mennyiség mező, akkor azt nézi, hogy szám-e, illetve üres-e (ez lesz a vizsgált feltétel)
        if (input.name === "price" || input.name === "quantity") {
            condition = (isNaN(input.value) || input.value === "");
            // ennek megfelelően állítja be a hibaüzenetet
            errormessage = "Nem megfelelő szám!";
        }
         // ha a vizsgált elem a többi mező, akkor csak azt vizsgálja, hogy üres-e (ez lesz a vizsgált feltétel)
         else {
            condition = input.value === "";
            errormessage = "Kötelező mező!";
        }
        // ha üres az érték (vagy nem szám), akkor beszúrja mögé a hibaüzenetet
        if (condition) {

            let node=$('<span>');
           // let node = document.createElement("SPAN");
            node.addClass("error");
            let textnode = node.text(errormessage);
            // ha az elem szülőelemének utolsó gyermeke nem error, akkor beszúrja a hibaüzenetet
            if (x.lastChild.className !== "error") {
                node.append(textnode);
                x.append(node);
            }
            // és visszatér hamis értékkel
            return false;
        }
        // ha nem üres, és van hibaüzenet, akkor törli a hibaüzenetet
        else {
            if (x.last.className === "error") {
                x.last.remove();
            }
            // és visszatér igaz értékkel
            return true;
        }
    }
    function pizzaValidate() {
        // űrlap és elemei meghatározása
        let pizza = $("addPizza");
        let name = pizza.name;
        let prodid = pizza.prodid;
        let price = pizza.price;
        let description = pizza.description;
        let quantity = pizza.quantity;
        let picid = pizza.picid;

        // hozzárendeli az elemekhez, hogy az isValid() függvény igaz, vagy hamis értékkel tért vissza
        let values = [name, prodid, price, description, quantity].map(el => isValid(el));

        // ha az összes elemet igazra értékeli
        if (values.forEach(Boolean)) {
            // akkor készít egy objektumot

            let pId = name.value + prodid.value;
            let Product = {
                    "name": name.value,
                    "quantity": quantity.value,
                    "price": price.value,
                    "description": description.value,
                    "prodid": pId,
                    }
                // majd az objektumot elmenti a localStorage-ba
            localStorage.setItem(pId, JSON.stringify(Product));
            pizzaArray.push(pId);
            localStorage.setItem('productsArray', JSON.stringify(pizzaArray))
                // végül beküldi az űrlapot, és az oldal újratöltődik
            pizza.submit();

        }

    }

    
    
   































}