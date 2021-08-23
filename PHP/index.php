<?php

require_once('Car.php');
require_once('Account.php');
require_once('Uberx.php');

$UberX = new UberX("CVB123", new Account("Andrea Herrera", "ANDA123"), "Chevrolet", "Spark");
$UberX->printDataCar();

$UberPool = new UberX("ABC123", new Account("Martin Jaramillo", "MTN123"), "Grand Vitara", "Suzuki");
$UberPool->printDataCar();

?>