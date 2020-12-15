package fr.perez.epsi.solid;


import fr.perez.epsi.solid.config.ParamConfig;
import fr.perez.epsi.solid.echange.Echange;
import fr.perez.epsi.solid.echange.specialisation.EchangePartage;
import fr.perez.epsi.solid.factory.IIndividuFactory;
import fr.perez.epsi.solid.factory.implementation.IndividuFactory;
import fr.perez.epsi.solid.richesse.Richesse;
import fr.perez.epsi.solid.richesse.specialisation.RichesseLoiNormale;
import fr.perez.epsi.solid.transaction.Transaction;
import fr.perez.epsi.solid.transaction.specialisation.TransactionAleatoire;
import fr.perez.epsi.solid.utils.Gini;
import fr.perez.epsi.solid.utils.Market;

/**
 * Class d'exécution du projet
 */
public class SolidApplication {

    /**
     * Initialisation des objets et lancement des méthodes
     * @param args arguments
     */
    public static void main(String[] args) {
        // ParamConfig(mu, sigma, iteration, n)
        ParamConfig paramConfig = new ParamConfig(100, 20, 10000, 1000);

        Echange classEchange = new EchangePartage();
//        Echange classEchange = new EchangeComplet();

        Richesse classRichesse = new RichesseLoiNormale();
//        Richesse classRichesse = new RichesseRandom();

        Transaction classTransation = new TransactionAleatoire();
//        Transaction classTransation = new TransactionAleatoire();

        IIndividuFactory factoryIndividu = new IndividuFactory();

        Market market = new Market(paramConfig, classEchange, classRichesse, classTransation, factoryIndividu);

        System.out.println("Valeur pré-échange : " + Gini.calculGini(market.population));

        market.marketExchange();

        System.out.println("Valeur pré-échange : " + Gini.calculGini(market.population));
    }

}
