package com.JQuery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DragMetoMyTarget_getText extends BaseTest {
	

  public static void main(String[] args)     {
	  DragMetoMyTarget_getText jQuery=new DragMetoMyTarget_getText();
	  jQuery.applicationlaunch();
	  jQuery.getText_DragMeToMyTarget();
	  jQuery.applicationclose();
	  
		
	}

  public void getText_DragMeToMyTarget() 
  
	{
	  
	  //Thread.sleep(3000);
	  //<div id="draggable" class="ui-widget-content ui-draggable ui-draggable-handle" style="position: relative; left: -7px; top: 37px;">
		//<p>Drag me to my target</p></div>
	  
	By  DragMetoMyTargetProperty =By.id("draggable");
	 WebElement DragMetoMyTarget=driver.findElement(DragMetoMyTargetProperty);
	 String DragMetoMyTarget_Text=DragMetoMyTarget.getText();
	 
	 System.out.println("The DragMetoMyTarget Text is :"+ DragMetoMyTarget_Text);
	}

}
