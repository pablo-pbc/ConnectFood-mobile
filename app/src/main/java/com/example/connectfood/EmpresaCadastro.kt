package com.example.connectfood

data class EmpresaCadastro(
    val logradouro: String?,
    val numero: String?,
    val complemento: String?,
    val fantasia: String?,
    val atividade_principal: List<AtividadePrincipal>?,
    val municipio: String?,
    val bairro: String?,
    val uf: String?,
    val cep: String?,
    val email: String?,
    val telefone: String?,
    val message: String?,
)

data class AtividadePrincipal(
    val code: String?,
    val text: String?
)

