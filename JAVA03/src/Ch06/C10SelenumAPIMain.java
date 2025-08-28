package Ch06;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//크롬서버.jar 다운로드 경로(셀레니움 공식 홈페이지)
//https://www.selenium.dev/downloads/

//크롬드라이브 다운로드 경로
//https://googlechromelabs.github.io/chrome-for-testing/#stable
//grid->4.35 download

public class C10SelenumAPIMain {
	private static final String WEB_DRIVER_ID = "webdrivar.chorme.driver";
	private static final String WEB_DRIVER_PATH = "src/Drivers/chormedriver.exe";
	

	public static void main(String[] args) {
		//Selenum 3.x 기준 브라우저 활성화 방법(4.x 부터는 chromedriver.exe를 윈도우 PATH에 등록시 경로설정 필요 없음)
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		//크롬브라우저 옵셜 설정
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless"); //백그라운드 실행
//		options.addArguments("--no--snadbox"); //리눅스환경 sendbox 사용여부
		
		//크롬브라우저 활성화
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.naver.com");
		
		//특정요소 위치 선택(키워드 입력시)
		WebElement SearchEl = driver.findElement(By.id("query"));
		
		//키워드 입력
		SearchEl.sendKeys("모니터");
		
		//엔더키 전달
		SearchEl.sendKeys(Keys.RETURN);
		
		//쇼핑버튼 클릭(.api_flicking_wrap .tab:nth-child(1))
		WebElement shoppingBtnEl = driver.findElement(By.cssSelector(".api_flicking_wrap .tab:nth-child(1)"));
		//새창열기 제거
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].removeAttribute('target')");
		shoppingBtnEl.click();
		
		//리뷰 좋은 수 클릭
		WebElement reviewBtnEl = driver.findElement(By.cssSelector(".subFilter_sort_40_hv"));
		//창닫기
		//driver.close();
	}

}