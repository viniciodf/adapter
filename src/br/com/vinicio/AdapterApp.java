package br.com.vinicio;

import br.com.vinicio.adapter.SquarePegAdapter;
import br.com.vinicio.model.RoundHole;
import br.com.vinicio.model.RoundPeg;
import br.com.vinicio.model.SquarePeg;

public class AdapterApp {

    public static void main(String[] args) {
        var roundHole = new RoundHole(5);
        var roundPeg = new RoundPeg(5);

        if(roundHole.fits(roundPeg)){
            System.out.println("Round Peg fits round role");
        }

        var smallSquarePeg = new SquarePeg(2);
        var largeSquarePeg = new SquarePeg(20);

        //Won't compile
        //roundHole.fits(smallSquarePeg);

        var smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        var largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        if(roundHole.fits(smallSquarePegAdapter)){
            System.out.println("Square peg fits round hole");
        }

        if(!roundHole.fits(largeSquarePegAdapter)){
            System.out.println("Square peg does not fit into round role");
        }

    }
}
