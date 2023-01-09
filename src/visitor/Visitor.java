package visitor;

import java.util.Map;

import modelos.Album;
import modelos.Livro;

public interface Visitor {
	public void visiteLivro(Livro livro);
	
	public void visiteAlbum(Album album);
}
