/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author DiamondStalker
 */
public class Busqueda {
    WebDriver driver;
    By UserNameEmpoyee = By.id("empsearch_employee_name_empName");
    By IdEmployed = By.id("empsearch_id");
    By BtnSearch = By.id("searchBtn");
    By clickidsearch = By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td[3]/a");
    
    public Busqueda(WebDriver driver){
        this.driver = driver;
    }
    public void setusername(String Fname,String Mname, String Lname){
        String Username = Fname + " " + Mname + " "  + Lname;
        driver.findElement(UserNameEmpoyee).sendKeys(Username);
    }
    public void setid(String id){
        driver.findElement(IdEmployed).sendKeys(id);
    }
    public void clicksearch(){
        driver.findElement(BtnSearch).click();
    }
    public void clickidsearch(){
        driver.findElement(clickidsearch).click();
    }
    public void search(String Fname,String Mname, String Lname,String Id){
        this.setusername(Fname, Mname, Lname);
        this.setid(Id);
        this.clicksearch();
    }
}
