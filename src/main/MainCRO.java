package main;


import org.jgap.Chromosome;
import org.jgap.Configuration;
import org.jgap.FitnessFunction;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.IChromosome;
import org.jgap.InvalidConfigurationException;
import org.jgap.impl.CrossoverOperator;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;
import org.jgap.impl.MutationOperator;

import chromosome.CrisscrossCRO;
import fitness.FitnessFunctionNRPCRO;
import methods.Methods;

public class MainCRO {
	
	static final int POPULATION_SIZE = 120;
	static final int EVOLUTION_REVOLUTIONS = 60;
	static final int CHROMOSOME_SIZE = 36;
	
	public static final CrisscrossCRO workObject = Methods.feed6x6DoubleCROCharArray();
	
	public static void main(String[] args) {
		
		Configuration conf = new DefaultConfiguration();
		FitnessFunction fitnessFunction = new FitnessFunctionNRPCRO();
		
		
		Gene[] sampleGenes = new Gene[CHROMOSOME_SIZE];	
		
		
		try {
			
			conf.setFitnessFunction(fitnessFunction);
			conf.addGeneticOperator(new CrossoverOperator(conf));
			conf.addGeneticOperator(new MutationOperator(conf));
			conf.setKeepPopulationSizeConstant(true);
			conf.setPreservFittestIndividual(true);
			
			for (int i = 0; i < CHROMOSOME_SIZE; i++) {
				sampleGenes[i] = new IntegerGene(conf, 1, 30);
			}
			
			Chromosome chromosome = new Chromosome(conf, sampleGenes);
			conf.setSampleChromosome(chromosome);
			conf.setPopulationSize(POPULATION_SIZE);
			
			Genotype population = Genotype.randomInitialGenotype(conf);
			
			long startTime = System.currentTimeMillis();
			
			for (int i = 0; i < EVOLUTION_REVOLUTIONS; i++) {
				
				IChromosome theFittestOne = population.getFittestChromosome();
				System.out.println("Fitness vrijednost: " + theFittestOne.getFitnessValue() + " \n ");
				CrisscrossCRO.print6x6CharDoubleArrrayFromChromosome(theFittestOne);
				population.evolve();
				
			}
			
			long finishTime = System.currentTimeMillis();
			
			System.out.println((double)(finishTime - startTime)/1000 + " sekundi");
			
		} catch (InvalidConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
