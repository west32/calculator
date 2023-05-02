package pl.bartek.adventcallendar.service;

import java.util.Collection;
import java.util.List;

public class ServiceAdventCallendar {

        public int countIncreasment(List<Integer> data){
            int counter = -1;
            Integer previousElement = 0;
            Integer actualElement;

            for (int i = 0; i < data.size(); i++ ){

                actualElement = data.get(i);
                if (actualElement > previousElement){
                    counter++;
                }
                previousElement = actualElement;

            }
            return counter;
        }


    }





