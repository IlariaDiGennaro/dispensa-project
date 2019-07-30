<?php
$servername = "localhost";
$username = "username";
$password = "password";
$dbname = "my_pantry";

include '../function/dbConnection.php';

$barcode = $_GET["barcode"];
$brandCode = substr($barcode, 2, 5);
$productCode = substr($barcode, 7, -1);

class BrandProduct {
    function BrandProduct() {
        $this->brandName = null;
        $this->productName = null;
    }
}
$myObj = new BrandProduct();
$sentinel = 0;

$sqlBrandProduct = "SELECT b.name AS brandName, p.name AS productName
					FROM brand AS b, product AS p, barcode AS bc
        			WHERE bc.brand_id = b.id AND bc.product_id = p.id AND
        			bc.brand_code = '" . $brandCode . "' AND bc.product_code = '" . $productCode . "'";

$result = $conn->query($sqlBrandProduct);
if ($result->num_rows > 0) {
    while($row = $result->fetch_assoc()) {
        $myObj->brandName = $row["brandName"];
        $myObj->productName = $row["productName"];
        echo "1";
        $sentinel = 1;
    }
}

if($sentinel == 0){
    $sqlBrand = "SELECT b.name AS brandName
			FROM brand AS b, barcode AS bc
			WHERE bc.brand_id = b.id AND
			bc.brand_code = '" . $brandCode . "'";
    
    $result = $conn->query($sqlBrand);
    
    if ($result->num_rows > 0) {
        while($row = $result->fetch_assoc()) {
            $myObj->brandName = $row["brandName"];
            echo "2";
        }
    }
}

echo json_encode($myObj);

$conn->close();
?>