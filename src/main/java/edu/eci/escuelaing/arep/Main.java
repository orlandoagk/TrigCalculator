package edu.eci.escuelaing.arep;

import edu.eci.escuelaing.arep.components.Calculator;
import org.json.JSONObject;

import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
        port(getPort());
        get("/calculateTrigonometric",(req,res)->{
            String operation = req.queryParams("operation");
            String number = req.queryParams("number");
            JSONObject jsonObject = new JSONObject();
            double valorARetornar = Calculator.calculateTrigonometric(operation,number);
            jsonObject.put("operation",operation);
            jsonObject.put("value",valorARetornar);

            return jsonObject;

        });

    }


    /**
     * This function see the enviorment variable PORT if this exist that is returned if not the function return 4567
     * @return int that is the port that use Spark
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}
