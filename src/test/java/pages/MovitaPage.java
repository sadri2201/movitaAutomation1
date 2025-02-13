package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class MovitaPage {

    public MovitaPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /*
          HomePage LOCATORS
          LoginPage LOCATORS
          Menü Secenekleri Locators
     */


    @FindBy (id = "logo")
    public WebElement movitaLogo;

    @FindBy(xpath = "//div[text()=\"Mobil Vasıta İzleme Takip Sistemi\"]")
    public WebElement mainTextTurkish;

 @FindBy(xpath = "//*[.=\"NEDEN TAKİP SİSTEMİ\"]")
 public WebElement nedenTakipSistemi;
    //-------------Cozumler----------- (Anasayfanın en alt kısmındaki)
//-------------Okul servis araclari----------

    @FindBy(xpath = "(//h4)[4]")
    public WebElement cozumlerOkul;

    @FindBy(xpath = "//h1")
    public WebElement okulServisText;

//-------------Kamerali arac takip sistemi-----------

    @FindBy(xpath = "(//h4)[5]")
    public WebElement cozumlerKamerali;

    @FindBy(xpath = "//h1")
    public WebElement kameraliAracText;

//-------------Kişi Bilgilendirme Sistemi-----------

    @FindBy(xpath = "(//h4)[6]")
    public WebElement cozumlerKisi;

    @FindBy(xpath = "//h1")
    public WebElement kisiBilgilendirmeText;

//-------------Kişi ve Nesne Sistemi-----------

    @FindBy(xpath = "//*[@id=\"post-list-footer\"]/div[4]/div/div/div/h4/a")
    public WebElement cozumlerKisiVeNesne;

    @FindBy(xpath = "//h1")
    public WebElement kisiVeNesneText;


 //---------Clickable Drowdown Language Menu---------------------
 @FindBy(xpath = "//*[@id=\"dropdownMenuButton\"]/img")
 public WebElement flag_up_right;
 @FindBy(xpath = "//*[@id=\"header-wrap\"]/div/div/div[3]/div/a[1]/img")
 public WebElement eng_Flag;
 @FindBy(xpath = "//*[@id=\"header-wrap\"]/div/div/div[3]/div/a[2]/img")
 public WebElement tr_Flag;
 @FindBy(xpath = "/html/body/div[1]/section[1]/div/div/div[1]/div/ul/li[1]/div[3]/div/div/div")
 public WebElement engWriting;
 @FindBy(xpath = "/html/body/div[1]/section[1]/div/div/div[1]/div/ul/li[1]/div[3]/div/div/div")
 public WebElement trWriting;

 // ---------------huseyinKartal ------------
 //--------------US_MAT11-TC_MAT100_Main Page First Section_Hover_Over_Menu----
 @FindBy(xpath = "//*[@id=\"header-wrap\"]/div/div/nav/ul/li[5]/a/div")
 public WebElement rotaOptimizasyonu;
 @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
 public WebElement rotaWriting;
 @FindBy(xpath = "//*[@id=\"header-wrap\"]/div/div/nav/ul/li[6]/a/div")
 public WebElement uygulamalar;
 @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
 public WebElement uygulamalarWriting;
 @FindBy(xpath = "//*[@id=\"header-wrap\"]/div/div/nav/ul/li[7]/a/div")
 public WebElement kilavuz;
 @FindBy(xpath = "//*[@id=\"myTab2\"]/li[2]/a")
 public WebElement kilavuzWriting;
 @FindBy(xpath = "//*[@id=\"header-wrap\"]/div/div/nav/ul/li[8]/a/div")
 public WebElement iletisim;
 @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
 public WebElement iletisimWriting;
 @FindBy(xpath = "//*[@id=\"header-wrap\"]/div/div/a/div")
 public WebElement girisYap;
 @FindBy(xpath = "//button[@type=\"submit\"]")
 public WebElement girisYapButton;
 //--------------US_MAT11-TC_MAT100---END

 // ---------------huseyinKartal ------------
 //--------------TC_MAT121_ForgotPassword
 @FindBy(xpath="//a[text()=\"Şifrenizi mi unuttunuz?\"]")
 public WebElement forgotPassword;

 @FindBy(xpath="//button[text()=\" Şifre Değiştir\"]")
 public WebElement changePassword;
 @FindBy(xpath="//li[text()=\"Lütfen kullanıcı adınızı girdiğinizden emin olun!\"]")
 public WebElement noneCredentials;

@FindBy(id="username")
 public WebElement userName;
@FindBy(id="telefon")
 public WebElement phoneNumber;

 @FindBy(xpath="//div[@class=\"toast-message\"]")
 public WebElement toastMessage;
 //--------------TC_MAT121_END



 @FindBy(xpath = "//*[.=\"TSE BELGELİ CİHAZLAR\"]")
 public WebElement TSEBelgeseliCihazlar;

 @FindBy(xpath = "//*[.=\"ÜCRETSİZ İNCELEYİN\"]")
 public WebElement ucretsizInceleyin;

 @FindBy(xpath = "//*[.=\"Yazılım ve Teknoloji Geliştirme\"]")
 public WebElement yazilimTeknGelistirme;

 @FindBy(xpath = "//*[.=\"ARAÇ TAKİP SİSTEMİ\"]")
 public WebElement aracTakipSistemi;

 @FindBy(xpath = "//*[.=\"ÖNE ÇIKAN ÖZELLİKLERİMİZ\"]")
 public WebElement oneCikanOzellikler;

 @FindBy(xpath = "//*[.=\"KOLAY ERİŞİM\"]")
 public WebElement kolayErisim;

 @FindBy(xpath = "//*[.=\"TEKNİK DESTEK\"]")
 public WebElement teknikDestek;

 @FindBy(xpath = "//*[.=\"SEKTÖRLERE YÖNELİK ÇÖZÜMLER\"]")
 public WebElement sektorlereYonelik;

 @FindBy(xpath = "//div[@class=\"row justify-content-center col-mb-50\"]")
 public WebElement thirdSectionBody;

 @FindBy(xpath = "//div[@id=\"gotoTop\"]")
 public WebElement arrowsign;

 @FindBy(xpath = "(//*[.=\"Tüm Sektörlere Hitap Eden Çözümler\"])[3]")
 public WebElement tumSektorlerText;

 @FindBy(xpath = "(//*[.=\"Mobil Vasıta İzleme Takip Sistemi\"])[4]")
 public WebElement mobilText;

 @FindBy(xpath = "//button[@id=\"dropdownMenuButton\"]")
 public WebElement dropdown;

 @FindBy(xpath = "(//a[@class=\"dropdown-item\"])[1]")
 public WebElement turk;

 @FindBy(xpath = "//a[@href=\"/index_en\"]")
 public WebElement eng;

 @FindBy(xpath = "//div[@class=\"rs-fullvideo-cover\"]")
 public WebElement engPano;

 @FindBy(xpath = "(//a[@href=\"/rota_optimizasyonu\"])[1]")
 public WebElement rota;

 @FindBy(xpath = "(//div[@class=\"container clearfix\"])[1]")
 public WebElement rotaText;

 @FindBy(xpath = "//a[@href=\"/uygulamalar\"]")
 public WebElement uygulamalar1;

 @FindBy(xpath = "(//div[@class=\"container clearfix\"])[1]")
 public WebElement uygulamalarText;

 @FindBy(xpath = "//a[@href=\"/guide\"]")
 public WebElement kilavuz1;

 @FindBy(xpath = "//a[@href=\"#uygulama1\"]")
 public WebElement kilavuzText;

 @FindBy(xpath = "//a[@href=\"/iletisim\"]")
 public WebElement iletisim1;

 @FindBy(xpath = "(//div[@class=\"container clearfix\"])[1]")
 public WebElement iletisimText;

 @FindBy(xpath = "//*[.=\"GİRİŞ Yap\"]")
 public WebElement girisYap1;

 @FindBy(xpath = "//button[@type=\"submit\"]")
 public WebElement girisYapText;

 @FindBy(tagName = "body")
 public WebElement body;

 @FindBy(xpath = "(//a[@href=\"/bayi_basvuru\"])[2]")
 public WebElement bayilik;

 @FindBy(xpath = "(//*[.=\"Bayilik Başvuru\"])[1]")
 public WebElement bayilikText;

 @FindBy(xpath = "(//a[@href=\"/demo_basvuru\"])[2]")
 public WebElement demo;

 @FindBy(xpath = "(//*[.=\"Demo Başvuru\"])[1]")
 public WebElement demmoText;

 @FindBy(xpath = "//div[@id=\"gotoTop\"]")
 public WebElement arrow;

 @FindBy(xpath = "(//*[.=\"Tüm Sektörlere Hitap Eden Çözümler\"])[3]")
 public WebElement arrowText;

 @FindBy(xpath = "//*[.=\"GİRİŞ Yap\"]")
 public WebElement firstGirisYap;

 @FindBy(xpath = "//input[@id=\"username\"]")
 public WebElement username;

 @FindBy(xpath = "//input[@id=\"password\"]")
 public WebElement password;

 @FindBy(xpath = "//button[@type=\"submit\"]")
 public WebElement secondGirisYap;

 @FindBy(tagName = "body")
 public WebElement bodyLogin;

 @FindBy(xpath = "//img[@src=\"/images/profile_logo.png\"]")
 public WebElement demoLogo;

 @FindBy(xpath = "(//*[.=\"Lütfen şifrenizi girdiğinizden emin olun!\"])[1]")
 public WebElement passwordWarning;

 @FindBy(xpath = "(//*[.=\"Lütfen kullanıcı adınızı girdiğinizden emin olun!\"])[1]")
 public WebElement usernameWarning;

 @FindBy(xpath = "(//*[.=\"Şifrenizi mi unuttunuz?\"])[2]")
 public WebElement sifrenimiUnuttun;

 @FindBy(xpath = "//input[@id=\"username\"]")
 public WebElement usernameBox;

 @FindBy(xpath = "//input[@id=\"telefon\"]")
 public WebElement telephoneBox;

 @FindBy(xpath = "(//*[.=\"Movita Şifre Yenileme\"])[2]")
 public WebElement sifreYenileme;

 @FindBy(xpath = "(//img[@src=\"/images/icons/ic-logo.png\"])[2]")
 public WebElement movitaLOGO;

 @FindBy(xpath = "//button[@type=\"submit\"]")
 public WebElement sifreDegistir;

 @FindBy(xpath = "(//*[.=\"Giriş Ekranı\"])[2]")
 public WebElement girisEkrani;

 @FindBy(xpath = "(//a[@href=\"/\"])[2]")
 public WebElement anaSayfayaDon;

 @FindBy(xpath = "//div[@class=\"col-md-6 text-center text-md-start\"]")
 public WebElement copyrightText;

 @FindBy(xpath = "(//li[@class=\"nav-item has-sub\"])[1]")
 public WebElement raporlar;

 @FindBy(xpath = "//input[@id=\"tarih1\"]")
 public WebElement baslangicTarihi;


 //SmokeTest_US_MAT-127-Report_Modules
 //Login Page Menu - Reports Locators

 @FindBy(xpath = ".//*[text()=\"Raporlar\"]")
 public WebElement menuRaporlar;

 @FindBy(xpath = ".//*[text()=\"Araç Bazlı Rapor\"]")
 public WebElement menuAracBazliRapor;


 @FindBy(css = "div.btn")
 public WebElement menuRaporAlButton;

 @FindBy(xpath = ".//*[text()=\"Yakıt Entegrasyon Raporu\"]")
 public WebElement menuYakitEntegrasyonRaporu;

 @FindBy(xpath = ".//*[text()=\"Günlük Seyehat Raporu\"]")
 public WebElement menuGunlukSeyahatRaporu;

 @FindBy(xpath = ".//*[text()=\"Aktivite Detay Raporu\"]")
 public WebElement menuAktiviteDetayRaporu;

 @FindBy(xpath = ".//*[text()=\"Araç Karne\"]")
 public WebElement menuAracKarneRaporu;

 @FindBy(xpath = ".//*[text()=\"Filo Bazlı Rapor\"]")
 public WebElement menuFiloBazliRapor;

 @FindBy(xpath = ".//*[text()=\"Grup Bazlı Rapor\"]")
 public WebElement menuGrupBazliRapor;

 @FindBy(xpath = ".//*[text()=\"Alarm Log Raporu\"]")
 public WebElement menuAlarmLogRaporu;

 @FindBy(css = "button.btn")
 public WebElement menuSorgulaButton;

 @FindBy(xpath = ".//*[text()=\"Şoför Log Raporu\"]")
 public WebElement menuSoforLogRaporu;


 @FindBy(xpath = ".//*[text()=\"Sensör Log Raporu\"]")
 public WebElement menuSensorRaporu;

 //------TC-128------

 @FindBy(xpath = "//*[.=\"GİRİŞ Yap\"]")
 public WebElement girisYapFirst;

 @FindBy(xpath = "//button[@type=\"submit\"]")
 public WebElement girisYapSecond;

 @FindBy(xpath = "//img[@id='ic-logo']")
 public WebElement logoMainPage;

 @FindBy (xpath = "//div[@class='main-menu menu-fixed menu-light menu-accordion menu-shadow']")
 public WebElement allMenu;

 @FindBy(xpath = "//div[@id='map']")
 public WebElement map;

 @FindBy(xpath = "//div[@class='col-lg-2 col-md-2 text-xs-center']")
 public WebElement vehicles;

 @FindBy(xpath = "//li[@id='anasayfa']")
 public WebElement anasayfa;

 @FindBy(xpath = "//*[text()='Raporlar']")
 public WebElement raporlar2;

 @FindBy(xpath = "//*[text()='Araç Rota']")
 public WebElement aracRota;

 @FindBy(xpath = "//*[text()='Araç Video-Fotoğraf']  ")
 public WebElement aracVideoFotograf;

 @FindBy (xpath = "//*[text()='Güzergah İşlemleri']")
 public WebElement guzergahIslemleri;

 @FindBy(xpath = "//*[text()='Alarm İşlemleri']")
 public WebElement alarmIslemleri;

 @FindBy(xpath = "//*[text()='Rota İşlemleri']")
 public WebElement rotaIslemleri;

 @FindBy(xpath = "//*[text()='Personel İşlemleri']")
 public WebElement personelIslemleri;

 @FindBy(xpath = "//*[text()='Yönetim ve Ayarlar']")
 public WebElement yonetimAyarlar;

 @FindBy(xpath = "//li[@id='arac_bazli_rpr']")
 public WebElement aracBazli;

 @FindBy(xpath = "//li[@id='yakit_bazli_rpr']")
 public WebElement yakitBazli;

@FindBy(xpath = "//li[@id='arac_bazli_guzergah']")
 public WebElement aracBazliGuzergah;

@FindBy(xpath = "//li[@id='rota_optimizasyonu_oto']")
 public WebElement optimizasyon;

@FindBy(xpath = "//li[@id='personel_listesi']")
 public WebElement personel;

@FindBy(xpath = "//li[@id='filo_yonetim']")
 public WebElement grupYonetimi;

@FindBy(xpath = "//li[@id='arac_islem']")
 public WebElement aracIslemleri;

@FindBy(xpath = "//*[@id=\"main-menu-navigation\"]/li[2]/a")
public WebElement raporlar3;

@FindBy(xpath = "//a[@href=\"/alarm-listesi\"]")
public WebElement alarmIslemleri3;

@FindBy(xpath = "//img[@id=\"ic-logo\"]")
public WebElement movitaLogo2;

@FindBy(xpath = "//div[@class='content-wrapper']")
public WebElement loginPageLayout;

@FindBy(xpath = "/html/body/footer/p/span")
public WebElement copyRight;

 // Login Page - Login Button
 @FindBy(xpath = ".//*[text()=\" Giriş Yap\"]")
public WebElement loginButton;

@FindBy (css = "select.yearselect")
 public WebElement selectYear1;
 @FindBy (css = "select.monthselect")
 public WebElement selectMonth1;
 @FindBy (xpath = ".//td[text()=\"1\"]")
 public WebElement firstDayOfTheMonth;

 @FindBy (xpath = ".//*[text()=\"Detaylı Filtre\"]")
 public WebElement detayliFiltre;

 @FindBy (css = "label[for=\"tarih_filter\"]")
 public WebElement tarihfilter;

 @FindBy (css = "label[for=\"is_baslama_filter\"]")
 public WebElement iseBaslamaFilter;

 @FindBy (css = "label[for=\"is_bitis_filter\"]")
 public WebElement isBitisFilter;

 @FindBy (css = "input#tarih_filter")
 public WebElement inputTarihFilter;
 @FindBy (css = "input#is_baslama_filter")
 public WebElement inputIseBaslamaFilter;
 @FindBy (css = "input#is_bitis_filter")
 public WebElement inputIsBitisFilter;

 @FindBy (xpath = ".//td[contains(text(),\"2022\")]/parent::tr")
 public List<WebElement> resultDate2022;

 @FindBy (xpath = "//td[contains(text(),\"2021-11\")]/parent::tr")
 public List<WebElement> resultDate2021_11;

 @FindBy (xpath = "//td[contains(text(),\"2021-11-05\")]/parent::tr")
 public List<WebElement> resultDate2021_11_05;



}