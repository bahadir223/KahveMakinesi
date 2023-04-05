package kahvemakinesi;

public class Methods extends Depo{


    public static void kahveBoyutu() {
        System.out.println("Kahveniz Hangi Boyutta Olsun?\n1-Buyuk Boy\n2-Orta Boy\n3-Kucuk Boy");
        secim=scan.next();
        switch (secim){
            case "1":
                fiyat*=2;
                System.out.println(kahve +" Buyuk Boy " + sekerEklendi+ sutEklendi+ " Olarak Hazirlandi \nOdemeniz Gereken Tutar : "+fiyat+"  Afiyet Olsun");
                menuu();
            case "2":
                System.out.println(kahve+ " Orta Boy "+ sekerEklendi+ sutEklendi+ " Olarak Hazirlandi \nOdemeniz Gereken Tutar : "+fiyat+"  Afiyet Olsun");
                menuu();
            case "3":
                fiyat*=0.75;
                System.out.println(kahve+" Kucuk Boy "+ sekerEklendi+ sutEklendi+ " Olarak Hazirlandi \nOdemeniz Gereken Tutar : "+fiyat+"  Afiyet Olsun");
                menuu();
            default:
                System.out.println("Hatali Giris Yaptiniz");
                kahveBoyutu();
        }
        System.exit(0);

    }

    public static void sekerIsteme() {

        System.out.println("Şeker ister misiniz?");
        secim=scan.next().toLowerCase();

        switch (secim){
            case "evet":
                fiyat+=10;
                sekerEklendi="Ekstra Sekerli";
                System.out.println("Kahvenize Seker Eklendi");
                kahveBoyutu();
            case "hayir":
                sekerEklendi="";
                System.out.println("Kahvenize Seker Eklenmedi");
                kahveBoyutu();
            default:
                System.out.println("Hatali Giris Yaptiniz");
                sekerIsteme();
        }

    }

    public static void sutEkleme() {
        System.out.println("Süt eklememizi ister misiniz?");
        secim=scan.next().toLowerCase();
        switch (secim){
            case "evet":
                fiyat+=5;
                sutEklendi="Ekstra Sutlu";
                System.out.println("Kahvenize Sut Eklendi");
                sekerIsteme();
            case "hayir":
                sutEklendi="";
                System.out.println("Kahvenize Sut Eklenmedi");
                sekerIsteme();
            default:
                System.out.println("Hatali Giris Yaptiniz");
                sutEkleme();
        }
    }

    public static void menuu() {

        System.out.println("Hangi Kahveyi istersiniz?\n1-Turk Kahvesi\n2-Espresso\n3-Latte");

        secim=scan.next();

        switch (secim){
            case "1":
                fiyat=50;
                kahve="Turk Kahvesi";
              sutEkleme();
            case "2":
                fiyat=60;
                kahve="Espresso";
               sutEkleme();
            case "3":
                fiyat=70;
                kahve="Latte";
               sutEkleme();
            default:
                System.out.println("Hatali Giris Yaptiniz");
                menuu();

        }


    }



}
