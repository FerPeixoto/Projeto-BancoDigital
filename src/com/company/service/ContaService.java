package com.company.service;

import com.company.model.Conta;

public interface ContaService {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();
}