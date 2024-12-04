<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Community Fitness Challenge - User Management</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">User Management</h1>
        
        <!-- User Registration Form -->
        <div class="card mt-4">
            <div class="card-header bg-primary text-white">
                Add Participant
            </div>
            <div class="card-body">
                <form id="userForm">
                    <div class="mb-3">
                        <label for="name" class="form-label">Name</label>
                        <input type="text" class="form-control" id="name" required>
                    </div>
                    <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="email" class="form-control" id="email" required>
                    </div>
                    <div class="mb-3">
                        <label for="age" class="form-label">Age</label>
                        <input type="number" class="form-control" id="age" min="1" required>
                    </div>
                    <div class="mb-3">
                        <label for="challenge" class="form-label">Challenge</label>
                        <select class="form-select" id="challenge" required>
                            <option value="10K Steps">10K Steps</option>
                            <option value="Yoga Challenge">Yoga Challenge</option>
                            <option value="Cycling 50KM">Cycling 50KM</option>
                        </select>
                    </div>
                    <button type="submit" class="btn btn-success">Add Participant</button>
                </form>
            </div>
        </div>

        <!-- Participant List -->
        <div class="mt-5">
            <h2 class="text-center">Participants</h2>
            <table class="table table-striped" id="participantTable">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Age</th>
                        <th>Challenge</th>
                    </tr>
                </thead>
                <tbody>
                    <!-- Participants will be dynamically added here -->
                </tbody>
            </table>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Custom JS -->
    <script src="script.js"></script>
</body>
</html>

