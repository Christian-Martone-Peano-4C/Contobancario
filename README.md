# Contobancario





Ereditarietà:
con il concetto di ereditarietà si intende la capacità di una superclasse di trasmettere alle
sue sottoclassi i suoi metodi e i suoi attributi.
Ad esempio io ho utilizzato l’ ereditarietà estendendo i metodi e gli attributi di
ContoBancario, ovvero la superclasse, a ContoBancarioEsteso che è la sua sottoclasse.
Evita la duplicazione del codice;
si riutilizza il codice della superclasse, lo si fa utilizzando la parola extends;
semplificare la costruzione di nuove classi e la manutenzione.








Polimorfismo:
con il polimorfismo un metodo assume una diversa funzione nel programma e serve
per ridefinire un metodo gia esistente nella superclasse con lo stesso nome. Per fare ciò
si utilizza un override che serve per sovrascrivere i dati.
Ad esempio io ho utilizzato il polimorfismo nella sottoclasse ContoBancarioEsteso,
modificando il metodo “prelievo” con Fido.







This:
 E utilizzato principalmente all’ interno dei costruttori e dei metodi.Nel costruttore il this indica il parametro dell oggetto indicato.




protected: è una variabile di visibilità, essa permette la lettura della variabile indicata a tutte le sottoclassi.
super(): si usa per indicare un parametro ereditato dalla superclasse,é utilizzato nel costruttore della sottoclasse.
 
 
 Dentro un metoido c'è la possibilità di necessitare di una variabile, quando viene scritta nelle parentesi del metodo viene detta variabile passata per riferimennto.Viene utilizzato per evitare di creare infinite variabili dentro i metodi, che occcuperebbero spazio di memoria.


