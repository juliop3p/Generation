package aplicacao;

import java.util.ArrayList;

import entidades.ContaCorrente;
import entidades.ContaEmpresa;
import entidades.ContaEspecial;
import entidades.ContaPoupanca;

public class Main {
   public static void main(String[] args) {
     ContaCorrente contaCorrente = new ContaCorrente(987, 800, new ArrayList<Integer>());
     ContaEmpresa contaEmpresa = new ContaEmpresa(456, 15500, new ArrayList<Integer>());
     ContaEspecial contaEspecial = new ContaEspecial(321, 5000, new ArrayList<Integer>());
     ContaPoupanca contaPoupanca = new ContaPoupanca(147, 5450, new ArrayList<Integer>());
     
     System.out.println("##### BANCO GENERATION #####");
     
     System.out.println("\n--- CONTA CORRENTE ---");
     contaCorrente.credite(500);
     contaCorrente.emiteTalonario();
     contaCorrente.debite(150);
     contaCorrente.emiteExtrato();
     
     System.out.println("\n--- CONTA EMPRESA ---");
     contaEmpresa.debite(1300);
     contaEmpresa.emprestimoEmpresarial(8000);
     contaEmpresa.credite(2100);
     contaEmpresa.emiteExtrato();
     
     System.out.println("\n--- CONTA ESPECIAL ---");
     contaEspecial.emiteExtrato();
     contaEspecial.credite(300);
     contaEspecial.debite(2000);
     contaEspecial.calculaJuros();
     contaEspecial.emiteExtrato();
     
     System.out.println("\n--- CONTA POUPANÇA ---");
     contaPoupanca.debite(450);
     contaPoupanca.emiteExtrato();
     contaPoupanca.credite(1000);
     contaPoupanca.aniversarioMes();
     contaPoupanca.emiteExtrato();
   }
}
