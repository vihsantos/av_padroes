package visitor;

import java.util.Map;

import modelos.Album;
import modelos.Livro;

public interface Visitor {
	Map<String, String> visiteLivro(Livro livro);
	
	Map<String, String> visiteAlbum(Album album);
}
