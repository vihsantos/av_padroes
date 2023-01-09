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
        
        this.json += " \"titulo\" : " + "\"" + livro.getTitulo() + "\"" + "," + "\n" +
        		" \"avaliação\" : "  + livro.getAvaliacao().toString()  + "," + "\n" +
        		" \"editora\" : "  + livro.getEditora()  + "," + "\n" +
        		" \"idioma\" : "  + livro.getIdioma()  + "," + "\n" +
        		" \"autor\" : "  + livro.getAutor()  + "," + "\n" +
        		" \"num_paginas\" : "  + livro.getNumeroPaginas().toString() ;

        this.json += "\n}\n";
        
	}

	@Override
	public void visiteAlbum(Album album) {
		this.json += "{\n"; 
		
		this.json += " \"titulo\" : " + "\"" + album.getTitulo() + "\"" + "," + "\n" +
        		" \"avaliacao\" : " +  album.getAvaliacao().toString() +  "," + "\n" +
				" \"estudio\" : " + album.getEstudio()  + "," + "\n"+
        		" \"gravadora\" : "  + album.getGravadora()  + "," + "\n" +
        		" \"autor\" : "  + album.getAutor()  + "," + "\n" +
        		" \"duracao\" : " +  album.getDuracao() + "," 
        		;
		
		this.json += "\n}\n";
	}
	
	public String getJson() {
		return this.json;
	}
}
