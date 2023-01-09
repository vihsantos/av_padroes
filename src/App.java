import java.util.List;
import bridge.MeioLatex;
import modelos.Obra;
import modelos.ObraDB;
import template_method.RelatorioCompleto;
import template_method.TemplateRelatorio;
import visitor.JsonExportVisitor;
import visitor.XMLExportVisitor;

public class App {

    public void runApp(){
        ObraDB datasource = ObraDB.instance();
        List<Obra> obras = datasource.getObras();
        JsonExportVisitor visitor = new JsonExportVisitor();
        XMLExportVisitor visitor2 = new XMLExportVisitor();

        // obras.forEach(item->{
        //     item.accept(visitor);
        //     System.out.println(visitor.getJson() + "\n");
        // });

        obras.forEach(item->{
            item.accept(visitor2);
            System.out.println(visitor2.getXML() + "\n");
        });
    }

    public void runApp2(){
        ObraDB datasource = ObraDB.instance();
        TemplateRelatorio relatorio = new RelatorioCompleto(datasource.getObras(), new MeioLatex());
        relatorio.gerarRelatorio();
    }

    public static void main(String[] args) throws Exception {
        (new App()).runApp();
    }
}
