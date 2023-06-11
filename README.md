# QAML-Selenium-ProyectoFinal

Este proyecto tiene como objetivo evaluar los conocimientos adquiridos en el curso de QAML-Selenium WebDriver con Java.

Se utilizó Java con Selenium WebDriver y la herramienta de pruebas TestNG. 
Se implementaron los patrones de diseño de Page Object Model y Page Factory.

El objetivo de la prueba automatizada consiste en los siguientes pasos:

1. Abrir el navegador y dirigirse a la página.
2. Una vez cargada la página se selecciona uno de los productos que se muestra en la pantalla.
3. Al dar click se redirige a una nueva página que muestra el detalle del producto seleccionado.
4. En esta nueva página se valida que el nombre, imagen, descripción y costo del producto estén presentes.
5. Posteriormente se da click en el botón "Add to cart".
6. Aparece una ventana emergente con un texto y el botón de "Ok", en el cual se debe dar click.
7. El siguiente paso es dar click en la opción de "Cart", desplegada en el menú principal.
8. Al dar click nos redirige a la página de checkout.
9. En la página de checkout se valida el nombre, descripción, costo y botón de eliminar producto.
10. Después de validar que la información es correcta se da click en el botón "Place Order".
