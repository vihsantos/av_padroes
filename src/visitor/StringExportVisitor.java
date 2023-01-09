package visitor;

import modelos.Album;
import modelos.Livro;

public class StringExportVisitor implements Visitor {

	private String string;

	public StringExportVisitor(){
		this.string = "";
	}
	
	@Override
	public void visiteLivro(Livro livro) {
        string += "Editora: " + livro.getEditora() + "\n" +
        		"Numero de Páginas: " + livro.getNumeroPaginas().toString() + "\n" +
				"Avaliação: " + livro.getAvaliacao() + "\n";

	}

	@Override
	public void visiteAlbum(Album album) {
		string += "Gravadora: " + album.getGravadora() + "\n" +
        		"Estúdio: " + album.getEstudio() + "\n" +
				"Avaliação: " + album.getAvaliacao() + "\n";
	}
	
	public String getString() {
		String export = string;
		string = "";
		return export;
	}

}
