# Solid example application

## Introduction
Ce projet a pour objectif de mettre en évidence les différents concepts SOLID, au travers d'un TP nommé Simulation économique.
Voici l'énoncé :

### Objectif
Programmer une application de simulation économique de transactions financières en respectant les principes SOLID.

### Explications
Il s’agit de concevoir une simulation d’une place marché où il existe une population d’individus,chacun ayant un certain niveau de richesse.  A chaque itération, deux acteurs (un acheteur et un vendeur) choisis parmi la population par une fonction  d’interaction effectuent une transaction qui résulte d’un échange de richesse entre eux selon une fonction de transaction.L’objectif est de comprendre l’évolution de la richesse de la population au cours du temps.
* On modélisera une population de n individus, chacun possédant une certaine richesse définie par une distribution normale de paramètres.
* Pour contrôler la répartition de la richesse au sein de la population au cours de la simulation, on calculera le paramètre de Gini. On veillera à trier le vecteur des richesses par ordre croissant.
* Au cours d’une transaction, deux acteurs interagissent et échangent leur richesse.  La fonction de transaction considérée est telle que la totalité de l’argent des deux acteurs est mise dans un pot commun, puis ce pot est divisé aléatoirement entre les deux acteurs.
* La fonction d’interaction est telle que les deux acteurs sont choisis aléatoirement dans la population.
* Le processus d’interaction et de transaction est répété un grand nombre fois. Les coefficients de Gini initiaux et finaux devront être calculés et affichés pour montrer que la simulation a bien fonctionné.


### Déroulement
L’objectif du travail est de concevoir l’application en respectant les 5 principes SOLID et proposer ainsi une application robuste, maintenable et évolutive.  Dans un premier temps, on veillera à développer un programme fonctionnel. Dans un second temps, on proposera :
* La lecture des paramètres d’entrées de la simulation (taille de la population, (μ, σ), nombre d’itérations) depuis un fichier JSON ou YAML.
* Une seconde loi de transaction telle que le pot commun soit intégralement reversé à un seul des acteurs, choisi aléatoirement parmi les deux.
* Une seconde loi d’interaction telle que chaque individu n’interagit qu’avec son voisin.
* Une seconde loi de distribution initiale de la richesse (comme par exemple une distribution log-normale ou chi).

## Execution du projet
Afin de lancer le projet, la fonction main se trouve dans la classe SolidApplication.

Il est également possible de paramétrer l'exécution via les classes spécialisé dont voici une liste :

* Echange : permet de spécifier le type d'échange entre les individus
    * EchangeComplet : Tous le pot commun n'est distribué qu'à un seul individu tiré au hasard
    * EchangePartage : Partage aléatoire du pot commun entre les indivus
* Richesse : permet de spécifier quel type d'allocation des richesses sera employé
    * RichesseLoiNormale : Allocation respectant une loi normale, selon un mu et un sigma donné
    * RichesseRandom : Allocation aléatoire, selon un écart de plus ou moins sigma autour de mu
* Transaction : permet de spéicifier entre quels partis une transaction sera effectués
    * TransactionAleatoire : Transaction entre deux individus sélectionnés aléatoirement
    * TransactionVoisin : Transaction entre les voisins directs