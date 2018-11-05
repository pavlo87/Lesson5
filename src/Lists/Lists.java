package Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> name =new ArrayList<>();
        name.add("Pavlo");
        name.add("Petro");
        name.add("Mukola");
        name.add("Taras");
        name.add("Masha");
        System.out.println(name);
        List<String> newname= new ArrayList<>();
        newname.add("Dasha");
        newname.add("Luba");
        newname.add("Oleg");
        newname.add("Sofija");
        newname.add("Oleg");
        newname.add("Tanja");
        System.out.println(newname);
        name.addAll(newname);
        System.out.println(name);
        System.out.println("Length: "+name.size());
        System.out.println("Oleg index:"+" "+ name.indexOf("Oleg")+" and "+name.lastIndexOf("Oleg"));

    }
}
