/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming;

import org.junit.Test;
import static org.junit.Assert.*;
import streaming.entity.Film;
import streaming.exception.SynopsisVideException;
import streaming.service.FilmService;

/**
 *
 * @author admin
 */
public class ModerationTest {

    FilmService fserv = new FilmService();

    @Test
    public void filmModerationTest() throws SynopsisVideException {
        Film f = new Film();
        f.setId(12L);
        f.setTitre("Coucou");
        f.setSynopsis("coucou");
        fserv.ajouter(f);
        System.out.println(f.getTitre() + " " + f.getSynopsis());

    }

}
