package br.com.ricardoasilveira.blog.graphql;

/**
 * Representa uma postagem
 * @param id
 * @param content
 */
record Post(String id, String content) {
}

/**
 * Representa um ou mais comentários de uma postagem
 * @param id
 * @param content
 * @param postId ligação entre um post com um ou mais comentários
 */
record Comment(String id, String content, String postId) {

}
