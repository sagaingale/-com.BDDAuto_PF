package utilities;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasicMethod {
	
	public void radioType(List<WebElement> e, String input) {
		for (WebElement ele : e) {
			if(ele.getAttribute("value").equalsIgnoreCase(input)) {
				ele.click();
			}
		}
		
	}
	public void checkBox(List<WebElement> e, List<String> strings) {
		for(String string : strings) {
			for(WebElement ele : e) {
				if(ele.getAttribute("value").equalsIgnoreCase(string)) {
					ele.click();
				}
			}
		}
	}
	public void selectSelect(WebElement e, String input) {
		Select select = new Select(e);
		List<WebElement> options=select.getOptions();
		for (WebElement opt : options) {
			if(opt.getAttribute("value").equalsIgnoreCase(input)) {
				opt.click();
			}
		}
	}
	public void selectLanguage(List<WebElement> e, List<String> strings) {
		for(String string : strings) {
		for (WebElement ele : e) {
			if(ele.getText().equalsIgnoreCase(string)) {
				ele.click();
			}
		}
	}
}
}