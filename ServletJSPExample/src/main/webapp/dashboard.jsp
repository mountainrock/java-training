<!DOCTYPE html>
<html>
<head>
  <title>Market for selling and buying goods</title>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
</head>

<body>
  <header class="bg-dark text-white py-3">
    <div class="container">
      <h1 class="h3">My Online Marketplace</h1><a href="login.jsp" class="btn btn-secondary mt-3">Logout</a>
    </div>
  </header>
  <div class="container mt-4">
    <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="alert alert-success mt-3">
                    Hello, <%= request.getAttribute("username") %>!
                </div>
                
            </div>
        </div>
    <div class="row">
      <div class="col-lg-3">
        <h4>Filter By Category</h4>
        <ul class="list-group">
          <li class="list-group-item"><a href="category.html?category=electronics">Electronics</a></li>
          <li class="list-group-item"><a href="category.html?category=clothing">Clothing</a></li>
          <li class="list-group-item"><a href="category.html?category=furniture">Furniture</a></li>
   
          <!-- Add more categories here -->
        </ul>
      </div>
      <div class="col-lg-9">
        <div class="row">
          <div class="col-md-4 mb-4">
            <div class="card">
              <img src="https://images.unsplash.com/photo-1505740420928-5e560c06d30e" width="100px" class="card-img-top" alt="Product 1">
              <div class="card-body">
                <h5 class="card-title">Product 1</h5>
                <p class="card-text">$100</p>
                <a href="#" class="btn btn-primary">View Details</a>
              </div>
            </div>
          </div>
          <!-- Add more product cards here -->
        </div>
      </div>
    </div>
  </div>
  
</body>

</html>
