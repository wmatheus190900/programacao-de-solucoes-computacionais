import java.util.Scanner;
public class Exercicio14Lista2 {
    public static void main(String[] args) {
        Scanner bot=new Scanner(System.in);
        String git,clone="git clone",fetch="git fetch",pull="git pull";
        System.out.println("Digite o comando git <git comando(clone,fetch,pull)>");
        git=bot.nextLine();
        if(git.equalsIgnoreCase(clone)){
            System.out.println("Esse comando serve para clonar um repositório,faz com que não precise criar um do zero e permite que você trabalhe em um ambiente offline e faça experimentos sem afetar diretamente o repositório.");
        }else if(git.equalsIgnoreCase(fetch)){
            System.out.println("permite que baixe as novas atualizações do repositório remoto para sua branch local e possiblita comparações com sua branch local,sem contar que não altera a branch local automaticamente.");
        }else if(git.equalsIgnoreCase(pull)){
            System.out.println("mesma ideia do git fetch,porem mescla alterações a sua branch local automaticamente.");
        }
        bot.close();
    }
}


