package banking;

import java.util.Scanner;

public class BankTransfer {
	
	public static void main(String[] args) {

		class Bank
		{
			private String conta;
			private String nome;
			private long saldo;

			Scanner KB=new Scanner(System.in);
			
			// abrir conta
			
			void openAccount()
			{ 
				System.out.print("Informe o número da conta: ");
				conta=KB.next();
				System.out.print("Informe seu nome: ");
				nome=KB.next();
				System.out.print("Informe o saldo: ");
				saldo=KB.nextLong();
			}

			// mostrar detalhes da conta
			void showAccount()
			{ 
				System.out.println(conta+","+nome+","+saldo);
			}

			// depositar dinheiro
			void transfer()
			{
				long amt;
				System.out.println("Digite o valor que vai transferir : ");
				amt=KB.nextLong();
				saldo=saldo+amt;
			}

			// receber transferencia
			void receipt()
			{
				long amt;
				System.out.println("Enter Amount U Want to withdraw : ");
				amt=KB.nextLong();
				if(saldo>=amt)
				{ 
					saldo=saldo-amt;
				}
				else
				{
					System.out.println("Less Balance..Transaction Failed..");
				}
			}

			//method to search an account number
			boolean search(String acn)
			{ 
				if(conta.equals(acn))
				{ 
					showAccount();
					return(true);
				}
				return(false);
			}
		}
	}
}
	

	
	
	
	
