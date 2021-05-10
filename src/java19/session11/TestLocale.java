package java19.session11;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class TestLocale {
    public static void main(String[] args) {
        Locale locale = new Locale("ja","JP");
        ResourceBundle res = ResourceBundle.getBundle("main",locale);
        System.out.println(res.getString("Hello"));
        System.out.println(res.getString("Bye"));

        Locale localVN = new Locale("vi","VN");
        Locale localUSA = new Locale("en","US");
        Locale localFR = new Locale("fr","FR");
        Locale localEn = new Locale("en","UK");

        NumberFormat numberFormatVN = NumberFormat.getNumberInstance(localVN);
        NumberFormat numberFormatUSA = NumberFormat.getNumberInstance(localUSA);
        NumberFormat numberFormatFR = NumberFormat.getNumberInstance(localFR);
        NumberFormat numberFormatEN = NumberFormat.getNumberInstance(localEn);

        System.out.println(numberFormatVN.format(1000000));
        System.out.println(numberFormatUSA.format(1000000));
        System.out.println(numberFormatFR.format(1000000));
        System.out.println(numberFormatEN.format(1000000));

        NumberFormat numberFormatVNCurrency = NumberFormat.getCurrencyInstance(localVN);
        NumberFormat numberFormatUSACurrency = NumberFormat.getCurrencyInstance(localUSA);
        NumberFormat numberFormatFRCurrency = NumberFormat.getCurrencyInstance(localFR);
        NumberFormat numberFormatENCurrency = NumberFormat.getCurrencyInstance(localEn);

        System.out.println(numberFormatVNCurrency.format(1000000));
        System.out.println(numberFormatUSACurrency.format(1000000));
        System.out.println(numberFormatFRCurrency.format(1000000));
        System.out.println(numberFormatENCurrency.format(1000000));


        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, localVN);

        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.SHORT, localEn);

        System.out.println(dateFormat.format(date));
        System.out.println(dateFormat2.format(date));


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        String textDate = "10/05/2021";
        try {
            Date dateFormat3 = simpleDateFormat.parse(textDate);
            System.out.println(dateFormat3.getDate());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
