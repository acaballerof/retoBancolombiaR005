package co.com.choucair.certification.RetoBancolombiaR005.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BancolombiaPage {
    public static final Target ACERCA_DE_NOSOTROS_BUTTON = Target.the("where the user click the Acerca de Nosotros Button")
            .located(By.id("header-nosotros"));
    public static final Target INFORMACION_CORPORATIVA_BUTTON = Target.the("where the user click the Informacion corporativa button")
            .located(By.id("serv"));
    public static final Target PROVEEDORES_BUTTON = Target.the("where the user click the Proveedores button")
            .located(By.xpath("//a[contains(text(),'Proveedores')]"));
    public static final Target DESCARGAR_DOCUMENTO_BUTTON = Target.the("where the user click the button to view the PDF document")
            .located(By.xpath("//*[@id='wizard2']//div/div[3]/div/div[1]/div/p[2]/a[contains(text(),'Descarga el documento')]"));
    public static final Target TDC_BUTTON = Target.the("home button")
            .located(By.xpath("//*[@id='home-conoce-mas-productos']/div/div[2]/div[2]/div/div/div[1]/div/div[3]/span/a"));
    public static final Target TASAS_BUTTON = Target.the("Tasas TDC Button")
            .located(By.xpath("//*[@id='layoutContainers']/div/div[2]/div/div[6]/section/div[3]/section/div/div/div[3]/a"));
}
