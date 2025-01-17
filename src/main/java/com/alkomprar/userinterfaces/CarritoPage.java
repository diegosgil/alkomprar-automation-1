package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarritoPage {
	public static final Target ARTICULOS_CARRITO = Target.the("Articulos carrito").locatedBy("//ul[@class='item__list item__list__cart']/li");

	public static final Target NOMBRE_ARTICULO_CARRITO = Target.the("Nombre Articulos carrito").locatedBy("//span[contains(text(), '{0}')]");
	public static final Target ELIMINAR_CELULAR_CARRITO = Target.the("Eliminar celular del carrito").locatedBy("//a/i[@class='alk-icon-eliminar']");

}
