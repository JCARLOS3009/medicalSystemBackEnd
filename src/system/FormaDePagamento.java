abstract class FormaDePagamento {
    // Método template que define a estrutura básica do pagamento
    public void pagar(double valor) {
        if (autenticar()) {
            realizarPagamento(valor);
            comprovante();
        } else {
            System.out.println("Falha na autenticação. Pagamento não realizado.");
        }
    }

    // Método abstrato que deve ser implementado pelas subclasses para realizar o pagamento específico
    abstract void realizarPagamento(double valor);

    // Método opcional que pode ser sobrescrito pelas subclasses
    void comprovante() {
        System.out.println("Comprovante de pagamento gerado.");
    }

    // Método opcional que pode ser sobrescrito pelas subclasses
    boolean autenticar() {
        return true;
    }
}

class PagamentoDebito extends FormaDePagamento {
    @Override
    void realizarPagamento(double valor) {
        System.out.println("Pagamento no débito no valor de " + valor + " realizado com sucesso.");
    }
}

class PagamentoCredito extends FormaDePagamento {
    @Override
    void realizarPagamento(double valor) {
        System.out.println("Pagamento no crédito no valor de " + valor + " realizado com sucesso.");
    }
}

class PagamentoPIX extends FormaDePagamento {
    @Override
    void realizarPagamento(double valor) {
        System.out.println("Pagamento via PIX no valor de " + valor + " realizado com sucesso.");
    }

    @Override
    boolean autenticar() {
        // Para PIX, a autenticação é necessária
        return false;
    }
}

}
