package biceps.inc.common;

public class FinishedExercise 
{
	private int _reps;
	private int _weight;
	private Exercise _exercise;
	
	// TODO: should we allow non integer values for weight, Brandon?
	public FinishedExercise(Exercise exerciseType, int reps, int weight) {
		_reps = reps;
		_weight = weight;
		_exercise = exerciseType;
	}		
}
