package visitor;

import modelos.Album;
import modelos.Livro;

public class XMLExportVisitor implements Visitor {
	private String xml;
	
	public XMLExportVisitor(){
		this.xml = "";
	}

	@Override
	public void visiteLivro(Livro livro) {
        xml += "<livro titulo= " + "\"" + livro.getTitulo() + "\"" + " ano = " + "\"" + livro.getAno().toString() + "\"" + ">"; 
        
        xml +=  "<avaliacao>" + livro.getAvaliacao().toString() + "</avaliacao>" + "\n" +
        		"<editora>" + livro.getEditora() + "</editora>" + "\n" +
        		"<idioma>" + livro.getIdioma() + "</idioma>" + "\n" +
        		"<autor>" + livro.getAutor() + "</autor>" + "\n" +
        		"<num_paginas>" + livro.getNumeroPaginas().toString() + "</num_paginas>" + "\n";

		xml += "</livro>\n";
        
	}

	@Override
	public void visiteAlbum(Album album) {
		xml += "<album titulo= " + "\"" + album.getTitulo() + "\"" + " ano = " + "\"" + album.getAno().toString() + "\"" + ">"; 
        
        xml +=  "<avaliacao>" + album.getAvaliacao().toString() + "</avaliacao>" + "\n" +
        		"<estudio>" + album.getEstudio() + "</estudio>" + "\n" +
        		"<gravadora>" + album.getGravadora() + "</gravadora>" + "\n" +
        		"<autor>" + album.getAutor() + "</autor>" + "\n" +
        		"<duracao>" + album.getDuracao().toString() + "</duracao>" + "\n";

		xml += "</album>\n";
	}
	
	public String getXML() {
		return this.xml;
	}
}
