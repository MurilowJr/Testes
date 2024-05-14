package br.edu.fatec.sjc;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class NumberAscOrderTest {

    
    @Mock
    private NumberAscOrder numberAscOrder;
    @Mock
    private CustomStack<Double> customStack;
    @Mock
    private CalculableStrategy<Double> calculableStrategy;

    
    @BeforeEach
    public void setUp() {
        numberAscOrder = new NumberAscOrder(customStack);
    }

    @SuppressWarnings("unchecked")
    @Test
    public void testSortWithSixRandomNumbers() throws StackEmptyException, StackFullException {

        List<Double> randomNumbers = new ArrayList<>();

        // Gerar uma lista com 6 numeros aleatórios
        for (int i = 0; i < 6; i++) {
            double randomNumber = new Random().nextDouble();
            randomNumbers.add(randomNumber);
        }

        // Mockando o comportamento da pilha
        Mockito.when(customStack.getElements()).thenReturn(randomNumbers);
        Mockito.when(customStack.size()).thenReturn(6);

        // Lista ordenada sort()
        List<Double> sortedList = numberAscOrder.sort();

        // Verificação da lista
        List<Double> originalList = new ArrayList<>(randomNumbers);
        originalList.sort(Double::compareTo);

        Assertions.assertEquals(originalList, sortedList);

    }

    @Test
    public void testSortWithEmptyList() throws StackEmptyException, StackFullException {
        when(customStack.isEmpty()).thenReturn(true);
    
        // Verificando se a exceção é lançada corretamente
        NumberAscOrder<Double> numberAscOrder = new NumberAscOrder<>(customStack);
        try {
            numberAscOrder.sort();
            fail("StackEmptyException não foi lançado");
        } catch (StackEmptyException e) {
            
        }
    
        // Verificando se a pilha foi verificada corretamente
        verify(customStack, never()).pop();
        verify(customStack, atLeastOnce()).isEmpty();
    }
     
}