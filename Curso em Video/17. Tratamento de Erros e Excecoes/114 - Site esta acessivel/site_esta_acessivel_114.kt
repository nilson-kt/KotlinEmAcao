/**
 * Programa que verifica se o site Pudim (http://pudim.com.br) está acessível pelo computador usado.
 */

import java.net.HttpURLConnection
import java.net.URI

fun checarSite(urlString: String): Boolean {
    /**
     * @param urlString Uma url fornecida.
     * @return Um resultado lógico que indica se o site está ou não acessível.
     */
    var acessivel = false
    try {
        val uri = URI(urlString)
        val url = uri.toURL()
        val conexao = url.openConnection() as HttpURLConnection
        conexao.requestMethod = "GET"
        conexao.connectTimeout = 5000
        val resposta = conexao.responseCode
        if (resposta == HttpURLConnection.HTTP_OK) {
            acessivel = true
        }
        conexao.disconnect()
    } catch (e: Exception) {
        println(e.printStackTrace())
    }
    return acessivel
}

fun main() {
    /**
     * Checa um site, exibindo na tela se ele está acessível ou não.
     */
    val siteURL = "http://pudim.com.br"
    val isAcessible = checarSite(siteURL)
    if (isAcessible) print("Site acessível.") else print("Site não acessível!")
}
