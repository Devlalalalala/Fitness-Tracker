class User:
    def __init__(self, name, age, max_exercises):
        self.name = name
        self.age = age
        self.steps = 0
        self.distance = 0.0
        self.exercises = []
        self.max_exercises = max_exercises

    def add_exercise(self, exercise):
        if len(self.exercises) < self.max_exercises:
            self.exercises.append(exercise)
        else:
            print("Exercise list is full.")

    def add_steps(self, steps):
        self.steps += steps
        self.update_distance()

    def update_distance(self):
        # Assume 1 step equals 0.78 meters, converted to kilometers.
        self.distance = self.steps * 0.00078

    def __str__(self):
        return (f"User(name='{self.name}', age={self.age}, steps={self.steps}, "
                f"distance={self.distance:.2f} km, exercises={self.exercises})")


class FitnessTracker:
    def __init__(self):
        self.user = self.initialize_user()

    def initialize_user(self):
        name = input("Enter your name: ")
        age = int(input("Enter your age: "))
        max_exercises = int(input("Enter the maximum number of exercises you plan to add: "))
        return User(name, age, max_exercises)

    def start_tracking(self):
        while True:
            print("\n1. Add Steps")
            print("2. View Stats")
            print("3. Add Exercise")
            print("4. Exit")
            try:
                choice = int(input("Choose an option: "))

                if choice == 1:
                    self.add_steps()
                elif choice == 2:
                    self.view_stats()
                elif choice == 3:
                    self.add_exercise()
                elif choice == 4:
                    print("Exiting...")
                    break
                else:
                    print("Invalid choice. Please try again.")
            except ValueError:
                print("Please enter a valid number.")

    def add_steps(self):
        try:
            steps = int(input("Enter number of steps: "))
            self.user.add_steps(steps)
            print("Steps added successfully.")
        except ValueError:
            print("Please enter a valid number.")

    def view_stats(self):
        print(self.user)

    def add_exercise(self):
        try:
            count = int(input("Enter number of exercises: "))
            for i in range(count):
                exercise = input(f"Enter exercise {i + 1}: ")
                self.user.add_exercise(exercise)
            print("Exercises added successfully.")
        except ValueError:
            print("Please enter a valid number.")


if __name__ == "__main__":
    tracker = FitnessTracker()
    tracker.start_tracking()
