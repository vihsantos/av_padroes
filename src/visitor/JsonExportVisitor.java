package visitor;

import modelos.Album;
import modelos.Livro;

public class JsonExportVisitor implements Visitor {
	private String json;
	
	public JsonExportVisitor(){
		this.json = "";
	}

	@Override
	public void visiteLivro(Livro livro) {
        this.json += "{\n"; 
        
        this.json += " \"Titulo\" :" + "\"" + livro.getTitulo() + "\"" + "," + "\n" +
        		" \"Ano\" :" + "\"" + livro.getAno().toString() + "\"" + "," + "\n" +
        		" \"Avaliação\" :" + "\"" + livro.getAvaliacao().toString() + "\"" + "," + "\n" +
        		" \"Editora\" :" + "\"" + livro.getEditora() + "\"" + "," + "\n" +
        		" \"Idioma\" :" + "\"" + livro.getIdioma() + "\"" + "," + "\n" +
        		" \"Autor\" :" + "\"" + livro.getAutor() + "\"" + "," + "\n" +
        		" \"Numero de Páginas\" :" + "\"" + livro.getNumeroPaginas().toString() + "\"";

        this.json += "\n}";
        
	}

	@Override
	public void visiteAlbum(Album album) {
		this.json += "{\n"; 
		
		this.json += " \"Titulo\" :" + "\"" + album.getTitulo() + "\"" + "," + "\n" +
        		" \"Ano\" :" + "\"" + album.getAno().toString() + "\"" + "," + "\n" +
        		" \"Avaliação\" :" + "\"" + album.getAvaliacao().toString() + "\"" + "," + "\n" +
        		" \"Gravadora\" :" + "\"" + album.getGravadora() + "\"" + "," + "\n" +
        		" \"Autor\" :" + "\"" + album.getAutor() + "\"" + "," + "\n" +
        		" \"Duração\" :" + "\"" + album.getDuracao() + "\"" + "," + "\n" +
        		" \"Estudio\" :" + "\"" + album.getEstudio() + "\"";
		
		this.json += "\n}";
	}
	
	public String getJson() {
		return this.json;
	}
}
