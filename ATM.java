import java.util.Scanner;

/**
 * @author fatih-git
 */

public class ATM {

    public static void main(String[] args) {

        String userName, password;
        Scanner input=new Scanner(System.in);

        int right=3, balance=1500;
        int select;

        while(right>0){

            System.out.print("Kullanıcı adı: ");
            userName=input.nextLine();
            System.out.print("Şifre: ");
            password=input.nextLine();

            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Kodluyoruz Bankasına Hoşgeldiniz!");

                do{
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye\n" +
                            "4-Çıkış");
                    System.out.print("Seçim yapınız: ");
                    select=input.nextInt();

                    switch(select){
                        case 1:
                            System.out.print("Para Miktarı: ");
                            int price=input.nextInt();
                            balance+=price;
                            break;
                        case 2:
                            System.out.print("Para Miktarı: ");
                            price=input.nextInt();
                            if(price>balance){
                                System.out.println("Bakiye yetersiz.");
                            }
                            else{
                                balance-=price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: "+balance);
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Hatalı giriş!");
                            break;
                    }

                }while(select!=4);
                System.out.println("Tekrar görüşmek üzere.");
                break;

            }
            else{
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyin.");
            }

            if(right==0){
                System.out.println("Hesabınız bloke edildi, banka ile iletişime geçin.");
            }
            else{
                System.out.println("Kalan hakkınız:"+right);
            }

        }

    }

}
