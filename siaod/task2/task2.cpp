#include <iostream>
#include <fstream>
#include <cstring>

using namespace std;

struct License
{
    int licenseNumber;
    char licenseName[50];
    string licenseFounder;
    bool licenseStatus;
};

int main()
{
    string fileName;

    cout << "Input file name: ";
    cin >> fileName;

    fstream output_file("license.bin");
    if (!output_file.is_open())
    {
        cout << "File is not open!" << endl;
        return 1;
    }

    output_file << "Hello!";
    output_file.close();

    cout << "programm is finish!";
}