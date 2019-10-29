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

import chromosome.Crisscross;
import fitness.FitnessFunctionNRP;
import methods.Methods;

public class Main {
	
	static final int POPULATION_SIZE = 100;
	static final int EVOLUTION_REVOLUTIONS = 100;
	static final int CHROMOSOME_SIZE = 16;
	
	public static final Crisscross workObject = Methods.feed4x4DoubleCharArray();
	
	public static void main(String[] args) {
		
		Configuration conf = new DefaultConfiguration();
		FitnessFunction fitnessFunction = new FitnessFunctionNRP();
		
		
		Gene[] sampleGenes = new Gene[CHROMOSOME_SIZE];	
		
		
		try {
			
			conf.setFitnessFunction(fitnessFunction);
			conf.addGeneticOperator(new CrossoverOperator(conf));
			conf.addGeneticOperator(new MutationOperator(conf));
			conf.setKeepPopulationSizeConstant(true);
			conf.setPreservFittestIndividual(true);
			
			for (int i = 0; i < CHROMOSOME_SIZE; i++) {
				sampleGenes[i] = new IntegerGene(conf, 65, 90);
			}
			
			Chromosome chromosome = new Chromosome(conf, sampleGenes);
			conf.setSampleChromosome(chromosome);
			conf.setPopulationSize(POPULATION_SIZE);
			
			Genotype population = Genotype.randomInitialGenotype(conf);
			
			
			for (int i = 0; i < EVOLUTION_REVOLUTIONS; i++) {
				
				IChromosome theFittestOne = population.getFittestChromosome();
				System.out.println("Fitness vrijednost: " + theFittestOne.getFitnessValue() + " \n ");
				Crisscross.print4x4CharDoubleArrrayFromChromosome(theFittestOne);
				population.evolve();
				
			}
			
		} catch (InvalidConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
