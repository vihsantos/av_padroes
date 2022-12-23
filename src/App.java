import modelos.ObraDB;

public class App {

    public void runApp(){
        ObraDB datasource = ObraDB.instance();
        datasource.getObras().forEach(item->System.out.println(item.toString()));
    }

    public static void main(String[] args) throws Exception {
        (new App()).runApp();
    }
}
