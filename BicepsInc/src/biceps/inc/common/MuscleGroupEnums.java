package biceps.inc.common;

public class MuscleGroupEnums {

	// TODO: This is okay for now but we might want to consider a hierarchical type of structure.
	// This structure might allow us to say: For enum type UpperBody give me the sub types in "NormalMuscleGroups".
	// http://java.dzone.com/articles/enum-tricks-hierarchical-data
	
	// We could also just set up an inheritance structure where each of the below enum values is its own class that inherits from the level above it.
	// This is extremely verbose and kind of over engineered but it would be fairly simple.
	
	public enum MuscleGroups {
		UpperBody,
		LowerBody
	}
	
	public enum NormalMuscleGroups {
		Abs,
		Arms,
		Back,
		Chest,		
		Legs,		
		Shoulders,			
	}
	
	public enum AdvancedMuscleGroups {
		Abdominal,			// Stomach
		Biceps,				// Front of upper arm
		Deltoids,			// Top of shoulder
		ErectorSpinae,		// Lower Back
		Gluteus,			// Butt, hehe.
		Hamstrings,			// Thigh - back 
		LatissimusDorsi, 	// triangular muscle in the mid-back.
		Rhomboids,			// Between should blades
		Obliques, 			// Sides
		Pectoralis, 		// Front of upper chest
		Quadriceps,			// Front of thigh
		Trapezius,			// Upper/mid-back
		Triceps,			// Back of upper arms
	}
}
