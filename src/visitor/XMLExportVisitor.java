package visitor;

import modelos.Album;
import modelos.Livro;

public class XMLExportVisitor implements Visitor {
	private String json;
	
	public XMLExportVisitor(){
		this.json = "";
	}

	@Override
	public void visiteLivro(Livro livro) {
        json += "<"+ livro.getClass().getSimpleName() +">\n"; 
        
        json += "<Titulo>" + livro.getTitulo() + "<Titulo>" + "\n" +
        		"<Ano>" + livro.getAno().toString() + "<Ano>" + "\n" +
        		"<Avaliacao>" + livro.getAvaliacao().toString() + "<Avaliacao>" + "\n" +
        		"<Editora>" + livro.getEditora() + "<Editora>" + "\n" +
        		"<Idioma>" + livro.getIdioma() + "<Idioma>" + "\n" +
        		"<Autor>" + livro.getAutor() + "<Autor>" + "\n" +
        		"<numeroPaginas>" + livro.getNumeroPaginas().toString() + "<numeroPaginas>" + "\n";

        json += "<"+ livro.getClass().getSimpleName() +">";
        
	}

	@Override
	public void visiteAlbum(Album album) {
		json += "<"+ album.getClass().getSimpleName() +">\n"; 
		
		json += "<Titulo>" + album.getTitulo() + "<Titulo>" + "\n" +
        		"<Ano>" + album.getAno().toString() + "<Ano>" + "\n" +
        		"<Avaliacao>" + album.getAvaliacao().toString() + "<Avaliacao>" + "\n" +
        		"<Gravadora>" + album.getGravadora() + "<Gravadora>" + "\n" +
        		"<Autor>" + album.getAutor() + "<Autor>" + "\n" +
        		"<Duracao>" + album.getDuracao().toString() + "<Duracao>" + "\n" +
        		"<Estudio>" + album.getEstudio() + "<Estudio>" + "\n";
		
		json += "<"+ album.getClass().getSimpleName() +">";
	}
	
	public String getJson() {
		return this.json;
	}
}
