package co.com.Banistmo.Reto.userinterface;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;


public class MenusBanistmo extends PageObject {

    public static final Target BTN_ACEPTARCOOKIES = Target.the("Boton coookies").located(By.xpath("//*[@id=\"btn-aceptar-cookies\"]"));

    public static final Target BTN_NOSOTROS = Target.the("Boton Acerca de nosotros").located(By.xpath("//*[@id=\"menu-top\"]/div/ul[1]/li[4]/a"));

    public static final Target BTN_INFOCORPORAIVA = Target.the("Boton Informacion Corporativa").located(By.xpath("//*[@id=\"navbar-collapse-grid\"]/ul/li[3]/a"));

    public static final Target BTN_PROVEEDORES = Target.the("Boton Proveedores").located(By.xpath("//a[contains(text(), 'Proveedores')]"));

    public static final Target BTN_CONOCERMAS = Target.the("Boton Conocer mas").located(By.xpath("//*[@id=\"layoutContainers\"]/div/div[2]/section/div[2]/div[2]/div/div/div/div[1]/div[3]/a/button"));

    public static final Target LBL_CONVOCATORIA = Target.the("Boton Conocer mas").located(By.xpath("//*[@id=\"inline1\"]/div[1]/h4"));

    public static final Target BTN_DESCARGAR = Target.the("Boton Conocer mas").located(By.xpath("//button[contains(text(), 'Descargar')]"));


}
