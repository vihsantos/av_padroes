package visitor;

import java.util.HashMap;
import java.util.Map;

import modelos.Album;
import modelos.Livro;

public class MapExportVisitor implements Visitor {

	public String export(String...args) {
		StringBuilder sb = new StringBuilder();
		
		return sb.toString();
	}
	
	@Override
	public Map<String, String> visiteLivro(Livro livro) {
		Map<String, String> livroInfo = new HashMap<String,String>();
				
		livroInfo.put("Titulo",livro.getTitulo());
		livroInfo.put("Ano",livro.getAno().toString());
		livroInfo.put("Avaliação",livro.getAvaliacao().toString());
		livroInfo.put("Editora",livro.getEditora());
		livroInfo.put("Idioma",livro.getIdioma());
		livroInfo.put("Autor",livro.getAutor());
		livroInfo.put("Numero de Paginas",livro.getNumeroPaginas().toString());
		
		return livroInfo;
	}

	@Override
	public Map<String, String> visiteAlbum(Album album) {
		Map<String, String> albumInfo = new HashMap<String,String>();
		
		albumInfo.put("Titulo",album.getTitulo());
		albumInfo.put("Ano",album.getAno().toString());
		albumInfo.put("Avaliação",album.getAvaliacao().toString());
		albumInfo.put("Gravadora",album.getGravadora());
		albumInfo.put("Estudio",album.getEstudio());
		albumInfo.put("Autor",album.getAutor());
		albumInfo.put("Duração",album.getDuracao().toString());
		
		return albumInfo;
	}

}
