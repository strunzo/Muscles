package biceps.inc.common;

import biceps.inc.common.MuscleGroupEnums.MuscleGroups;

public class Exercise
{
	private String _name;
	private MuscleGroups _muscleGroup;	// TODO: Again this could easily change
	
	
	// TODO: When the user wants to actually record an exercise, it shouldn't be initialized here. 
	// These objects should represent a static list of possible exercises.
	// Because basically when we commit an exercise to memory it should probably look something like so:
	
	// CommitToMemory(a new exercise, the user)
	// CommitToMemory(new ExerciseDone(ExerciseType.Legs.LegPress, 10, 450), currentUser);
	
	// So what other properties actually make sense here?
	// =========================================
	// A few suggestions:	
	// An enum for MuscleGroup

	public Exercise(String name, MuscleGroups group) {
		_name = name;
		_muscleGroup = group;
	}
}
