# design_patterns

Ecrire un programme qui reçoit des données réseau.
Dès qu'une données arrive sur le réseau, une classe appelée ReseauListener doit en être informée.

La classe ReseauListener est fournie et ne peut pas être changée. Elle s'écrit comme suit :

class ReseauListener{

  public String donneeArrive(String s){
  
    return Calendar.getInstance().getDate() + " " + s;
    
    }
    
}

Cependant, on souhaite supprimer la date en début de la chaîne reçue.

La gestion du réseau doit supporter deux protocoles TCP/IP ou UDP/IP.
