package com.jeido.exercice4;

import com.jeido.exercice4.exceptions.NotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class RechercherVilleTest {
    private RechercheVille rv;

    @BeforeEach
    public void setUp() {
        rv = new RechercheVille(List.of("Valence", "Vancouver", "Budapest"));
    }

    @Test
    public void testRechercherVilleWhenRechercher_A_ThenThrows_NotFoundException() {
        String mot = "V";

        Assertions.assertThrows(NotFoundException.class, () -> rv.Rechercher(mot));
    }

//    @Test
//    public void testRechercherVilleWhenRechercher_Va_ThenResult_List_Valence_Vancouver() {
//        String mot = "Va";
//        List<String> villesAwaited = List.of("Valence", "Vancouver");
//
//        List<String> result = rv.Rechercher(mot);
//
//        Assertions.assertEquals(villesAwaited, result);
//    }
//
//    @Test
//    public void testRechercherVilleWhenRechercher_va_ThenResult_List_Valence_Vancouver() {
//        String mot = "va";
//        List<String> villesAwaited = List.of("Valence", "Vancouver");
//
//        List<String> result = rv.Rechercher(mot);
//
//        Assertions.assertEquals(villesAwaited, result);
//    }
//
//    @Test
//    public void testRechercherVilleWhenRechercher_ape_ThenResult_List_Budapest() {
//        String mot = "ape";
//        List<String> villesAwaited = List.of("Budapest");
//
//        List<String> result = rv.Rechercher(mot);
//
//        Assertions.assertEquals(villesAwaited, result);
//    }
//
//    @Test
//    public void testRechercherVilleWhenRechercher_asterisk_ThenResult_List_All() {
//        String mot = "*";
//        List<String> villesAwaited =  List.of("Valence", "Vancouver", "Budapest");
//
//        List<String> result = rv.Rechercher(mot);
//
//        Assertions.assertEquals(villesAwaited, result);
//    }

    @ParameterizedTest
    @MethodSource("parametersProvider")
    public void testRechercherVilleWhenRechercher_parameters_ThenResult_List(String mot, List<String> villesAwaited) {
        Assertions.assertEquals(villesAwaited, rv.Rechercher(mot));
    }

    public static Stream<Arguments> parametersProvider() {
        return Stream.of(
                Arguments.of("Va", List.of("Valence", "Vancouver")),
                Arguments.of("va", List.of("Valence", "Vancouver")),
                Arguments.of("ape", List.of("Budapest")),
                Arguments.of("*", List.of("Valence", "Vancouver", "Budapest"))
        );
    }
}
